getUserName
  ; < 6 getName   > ? @ makeConcatWithConstants 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; B 1org/jetbrains/plugins/github/api/GHRepositoryPath
 A D  E '(Ljava/lang/String;Ljava/lang/String;)V	  G H I id Ljava/lang/Long;  K ? L 6(Ljava/lang/Long;Ljava/lang/String;)Ljava/lang/String;
 N O P Q R java/lang/Long equals (Ljava/lang/Object;)Z
 T U V W X java/util/Objects hash ([Ljava/lang/Object;)I fullName RuntimeVisibleAnnotations /Lcom/fasterxml/jackson/annotation/JsonProperty; value private fork Code LineNumberTable LocalVariableTable this 7Lorg/jetbrains/plugins/github/api/data/GithubRepoBasic; RuntimeInvisibleAnnotations #Lorg/jetbrains/annotations/NotNull; RuntimeInvisibleTypeAnnotations getDescription getUrl 
getHtmlUrl getFullName getFullPath 5()Lorg/jetbrains/plugins/github/api/GHRepositoryPath; toString basic o Ljava/lang/Object; StackMapTable hashCode ()I 
SourceFile GithubRepoBasic.java BootstrapMethods x
 y z { ? | $java/lang/invoke/