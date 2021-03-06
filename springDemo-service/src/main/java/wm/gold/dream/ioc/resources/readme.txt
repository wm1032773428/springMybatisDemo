1.15.3。方便地访问低级资源
为了最佳地使用和理解应用程序上下文，您应该熟悉Spring的Resource抽象，如 参考资料中所述。

应用程序上下文是a ResourceLoader，可用于加载Resource对象。A Resource本质上是JDK java.net.URL类的功能更丰富的版本。实际上，在适当Resource的情况下包装一个实例的实现java.net.URL。A Resource可以透明方式从几乎任何位置获取低级资源，包括类路径，文件系统位置，可用标准URL描述的任何位置，以及一些其他变体。如果资源位置字符串是没有任何特殊前缀的简单路径，那么这些资源来自特定且适合于实际应用程序上下文类型。

您可以配置部署到应用程序上下文中的bean来实现特殊的回调接口，ResourceLoaderAware在初始化时自动回调，应用程序上下文本身作为传入 ResourceLoader。您还可以公开Resource要用于访问静态资源的类型属性。它们像任何其他属性一样被注入其中。您可以将这些Resource属性指定为简单String路径，并依赖特殊的JavaBean PropertyEditor（由上下文自动注册），以便Resource在部署Bean时将这些文本字符串转换为实际对象。

提供给ApplicationContext构造函数的位置路径实际上是资源字符串，并且以简单的形式根据特定的上下文实现进行适当处理。例如，ClassPathXmlApplicationContext将简单的位置路径视为类路径位置。您还可以使用具有特殊前缀的位置路径（资源字符串）来强制从类路径或URL加载定义，而不管实际的上下文类型如何。