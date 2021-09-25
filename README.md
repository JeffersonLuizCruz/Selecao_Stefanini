# Seleção para Estágio Stefanini

**Candidato:** Vinicius Barbosa Polito Lopes <br /> 
**Departamento:** PED <br /> 

## Documentação

### Front-end 
Foi feito utilizando Angular 2 <br /> 
O servidor está hospedado na porta:8081 <br /> 
Para ligar o servidor, utilize o comando: ng serve --port 8081 <br /> 

### Back-end
Foi feito utilizando Spring Boot <br /> 
O servidor está hospedado na porta:8080 <br /> 
Para ligar o servidor, utilize o comando: mvn spring-boot:run <br /> 

Após ligar as aplicações, entre em http://localhost:8081/ <br /> 

## Relatório de atividades
#### Dia 13/09
Apresentação do Projeto 
<br />
Fiz uma leitura rápida do documento.
<br /> 

#### Dia 14/09
Depois fui ler o documento com mais calma, destacando os pontos importantes. Então, comecei a tentar entender o que é Angular 2, através dos vídeos da plataforma da Academia Stefanini.7<br /> 
Depois fui relembrar como utilizar o GitHub para fazer o controle de versão do meu projeto, logo que fazia algum tempo desde a última vez que utilizei.<br /> 
Então tentei criar rotas simples para meu front-end. <br /> 
Referências do dia: <br /> 
https://www.youtube.com/watch?v=8OHoAZ6j0Rg <br /> 
https://www.youtube.com/watch?v=-GQohREekR4 <br /> 

#### Dia 15/09 
Aprendi um pouco sobre o framework Bootstrap, e consegui fazer o front para a aplicação receber o upload. <br /> 
Referências do dia: <br />
https://www.youtube.com/watch?v=GKNIzIXrwT8 <br /> 
https://www.youtube.com/watch?v=9wEX_4Hasjs <br /> 
https://qastack.com.br/programming/47936183/angular-file-upload <br /> 
https://www.primefaces.org/primeng/showcase/#/fileupload <br /> 

#### Dia 16/09 
Vi como enviar o arquivo para o backend, mas não deu muito certo. Então decidi buscar alguma referência de como implementar um arquivo de upload utilizando angular e spring-boot. Acabei tendo mais êxito na implementação da aplicação web. <br /> 
Referências do dia: <br />
https://www.youtube.com/watch?v=DtC_KfU6b1o <br /> 
https://frontbackend.com/spring-boot/spring-boot-2-angular-11-upload-file-example <br /> 
https://github.com/martinwojtus/tutorials/tree/master/spring-boot <br /> 
https://www.bezkoder.com/angular-12-spring-boot-file-upload/ <br /> 
Então decidi buscar uma aplicação já feita como base para enteder como integrar o back e o front. <br /> 

#### Dia 17/09
Comecei a tentar entender como é o processo de recorte e binarização. <br /> 
Referências do dia: <br />
https://www.youtube.com/watch?v=jHPQxTMfvIE <br /> 
https://www.youtube.com/watch?v=uZG-Y-wDNBQ <br /> 
#### Dia 18/09 
Dia OFF <br /> 
#### Dia 19/09
Descobri a existencia do OpenCV e fiz a configuração para utilização no Eclipse. <br /> 
Referências do dia: <br />
https://www.youtube.com/watch?v=Dk5zSWElkno <br /> 
#### Dia 20/09 
Foi feita formatação inicial do README.md (Essa documentação) <br /> 
Comecei a entender como utilizar o OpenCV <br /> 
Referências do dia: <br />
https://opencv-java-tutorials.readthedocs.io/en/latest/ <br /> 
https://stackoverflow.com/questions/28231066/how-to-crop-the-detected-face-image-in-opencv-java
#### Dia 21/09 
Tentei utilizar detecção de face como referência para fazer o recorte e a binarização. <br />
Referências do dia: <br />
https://blog.finxter.com/how-to-crop-an-image-using-opencv/
https://stackoverflow.com/questions/28231066/how-to-crop-the-detected-face-image-in-opencv-java
https://stackoverflow.com/questions/37946482/crop-images-area-with-opencv-java
#### Dia 22/09 
Fiz o recorte, grayscale e a binarização, em um projeto à parte para validar meu algoritmo de processamento de imagem. Entretanto, não tive muito êxito ao integrar com o spring boot.<br />
Referências do dia: <br />
https://stackoverflow.com/questions/48009317/  <br />
how-to-threshold-any-image-for-black-and-white-color-seperation-in-java <br />
https://www.embarcados.com.br/processamento-de-imagens-binarias/ (Python) <br />
https://stackoverflow.com/questions/31289895/threshold-image-using-opencv-java <br />
https://introcs.cs.princeton.edu/java/31datatype/Threshold.java.html <br />
https://www.tutorialspoint.com/explain-opencv-adaptive-threshold-using-java-example <br />
https://stackoverflow.com/questions/34358364/otsu-threshold-in-java <br />
https://docs.opencv.org/3.4/javadoc/constant-values.html#org.opencv.imgcodecs.Imgcodecs.IMREAD_GRAYSCALE <br />
https://stackoverflow.com/questions/8971308/what-is-cvsetto-function/8973044 <br />
https://stackoverflow.com/questions/17035005/using-get-and-put-to-access-pixel-values-in-opencv-for-java <br />
https://answers.opencv.org/question/5/how-to-get-and-modify-the-pixel-of-mat-in-java/ <br />
https://stackoverflow.com/questions/44880622/springboot-system-loadlibrary-run-twice/44899469 <br />
#### Dia 23/09
Passei o dia debugando o código para integrar o algoritmo, criado utilizando OpenCV, com a aplicação web, utilizando spring boot, e conclui o MVP. <br />
Referências do dia: <br />
https://stackoverflow.com/questions/44880622/springboot-system-loadlibrary-run-twice/44899469
https://answers.opencv.org/question/193924/failed-to-use-systemloadlibrarycorenative_library_name-on-raspberry-pi/
https://subscription.packtpub.com/book/application-development/9781783283972/1/ch01lvl1sec12/a-java-opencv-simple-application
#### Dia 24/09
Dia da entrega do projeto. <br />
Entretanto, informaram que estenderam o prazo para até o dia 26.