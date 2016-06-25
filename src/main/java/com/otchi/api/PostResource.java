package com.otchi.api;

import com.otchi.api.facades.dto.PostDTO;
import com.otchi.api.facades.dto.RecipeDTO;
import com.otchi.api.facades.dto.StoryDTO;
import com.otchi.application.PublicationsService;
import com.otchi.domain.kitchen.Recipe;
import com.otchi.domain.social.models.Post;
import com.otchi.domain.social.models.Story;
import com.otchi.infrastructure.config.ResourcesPath;
import com.otchi.infrastructure.storage.BlobObjectPutException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.security.Principal;
import java.util.List;


@RestController
@RequestMapping(value = ResourcesPath.POST)
public class PostResource {

    @Autowired
    private PublicationsService publicationsService;

    @RequestMapping(value = "/recipe", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public PostDTO publishNewRecipeAsPost(@RequestPart("pictures") List<MultipartFile> pictures,
                                          @RequestPart("recipe") RecipeDTO recipeDTO,
                                          Principal principal) throws BlobObjectPutException {
        Recipe recipe = recipeDTO.toDomain();
        Post savedPost = publicationsService.publishRecipe(recipe, pictures, principal.getName());
        return new PostDTO(savedPost);
    }

    @RequestMapping(value = "/story", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public PostDTO publishStory(@RequestPart("images") List<MultipartFile> images,
                                @RequestPart("story") StoryDTO storyDTO,
                                Principal principal) {
        Story story = storyDTO.toDomain();
        Post createdPost = publicationsService.publishStory(story, images, principal.getName());
        return new PostDTO(createdPost);
    }

}
