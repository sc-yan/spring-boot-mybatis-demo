# spring-boot-mybatis-demo

issue:

val item: DemoData = mapper.selectSingleItemByID(id)

a variable in Kotlin, if defined without a question mark(?), is supposed to be a non-null variable, whereas here I can get a null if I call mapper with an ID which is not in database.
