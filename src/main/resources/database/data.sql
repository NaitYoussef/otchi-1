INSERT INTO USER(ID,EMAIL,USERNAME,FIRST_NAME,LAST_NAME)
        VALUES(1,'zeroual.abde@gmail.com','zeroual.abde@gmail.com','Abdellah','ZEROUAL');

INSERT INTO USER(ID,EMAIL,USERNAME,FIRST_NAME,LAST_NAME)
        VALUES(2,'m.amine.jabri@gmail.com','m.amine.jabri@gmail.com','Amin','JABRI');

INSERT INTO USER(ID,EMAIL,USERNAME,FIRST_NAME,LAST_NAME)
        VALUES(3,'mr.jaifar@gmail.com','mr.jaifar@gmail.com','Reda','JAIFAR');

INSERT INTO ACCOUNT(ID,USER_ID,USERNAME,PASSWORD,ENABLED,LANG_KEY)
        VALUES(1,1,'zeroual.abde@gmail.com','$2a$10$9m.et2mcPSzA4RdS1AOGPemNLOCerTkyEC99BUdqMSNL.4F9HUtbW',1,'en');

INSERT INTO ACCOUNT(ID,USER_ID,USERNAME,PASSWORD,ENABLED,LANG_KEY)
        VALUES(2,2,'m.amine.jabri@gmail.com','$2a$10$2msNJre9jMfIKWxq/tXPP.F2GR6MRP3Hu0pscFOpYeOQzSqsrj2TO',1,'en');

INSERT INTO ACCOUNT(ID,USER_ID,USERNAME,PASSWORD,ENABLED,LANG_KEY)
        VALUES(3,3,'mr.jaifar@gmail.com','$2a$10$ir99IGmrvfFc90qloVGJr.XY03r2rFnsvhNcp8OH40HEClM7KSbeO',1,'en');