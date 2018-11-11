3.3.2。内置PropertyEditor实现

ByteArrayPropertyEditor

字节数组的编辑器。将字符串转换为其对应的字节表示形式。默认注册BeanWrapperImpl。

ClassEditor

解析表示类到实际类的字符串，反之亦然。当找不到某个类时，IllegalArgumentException会抛出一个类。默认情况下，注册者 BeanWrapperImpl。

CustomBooleanEditor

属性的可自定义属性编辑器Boolean。默认情况下，注册 BeanWrapperImpl但可以通过将其自定义实例注册为自定义编辑器来覆盖。

CustomCollectionEditor

集合的属性编辑器，将任何源Collection转换为给定的目标 Collection类型。

CustomDateEditor

可自定义的属性编辑器java.util.Date，支持自定义DateFormat。未默认注册。必须根据需要使用适当的格式进行用户注册。

CustomNumberEditor

定制的属性编辑器Number的子类，如Integer，Long，Float，或 Double。默认情况下，注册BeanWrapperImpl但可以通过将其自定义实例注册为自定义编辑器来覆盖。

FileEditor

将字符串解析为java.io.File对象。默认情况下，注册者 BeanWrapperImpl。

InputStreamEditor

单向属性编辑器，可以获取字符串并生成（通过中间ResourceEditor和Resource），InputStream以便InputStream 属性可以直接设置为字符串。请注意，默认用法不会InputStream为您关闭。默认情况下，注册者BeanWrapperImpl。

LocaleEditor

可以将字符串解析为Locale对象，反之亦然（字符串格式 [country][variant]与toString()方法 相同Locale）。默认情况下，注册者BeanWrapperImpl。

PatternEditor

可以将字符串解析为java.util.regex.Pattern对象，反之亦然。

PropertiesEditor

可以将字符串（使用java.util.Properties类的javadoc中定义的格式进行格式化 ）转换为Properties对象。默认情况下，注册者BeanWrapperImpl。

StringTrimmerEditor

修剪字符串的属性编辑器。（可选）允许将空字符串转换为null值。默认情况下未注册 - 必须是用户注册的。

URLEditor

可以将URL的字符串表示形式解析为实际URL对象。默认情况下，注册者BeanWrapperImpl。

BeanWrapperImpl的父类PropertyEditorRegistrySupport的createDefaultEditors方法,默认注册很多编辑器
当BeanWrapper在设置store的car属性时（BeanWrapper负责在实例化后期设置属性值），它会检索自定义属性编辑器的注册表，然后发现Car属性类型对应着CustomCarEditor，它就会去寻找这个属性编辑器进行后续操作。