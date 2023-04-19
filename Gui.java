//p AWT是Java的一个用于创建图形用户界面（GUI）或基于窗口的应用程序的API。 AWT的组件是平台相关的，也就是说，组件的显示会根据操作系统的视觉效果而变化。 AWT是重量级的，也就是说，它的组件使用了底层操作系统的资源。
// AWT提供了一些基本的GUI组件，如按钮、文本框、标签、复选框、单选按钮、列表、菜单等，以及一些用于绘制图形和图像的类，如Color、Font、Graphics等。AWT还提供了一些用于布局管理、事件处理、剪贴板访问、打印等功能的类。
// AWT是Java最早提供的GUI框架，现在也有一些更先进的框架，如Swing和JavaFX，但AWT仍然可以用于创建一些轻量级的GUI应用程序。

//p Swing是Java的一个用于创建图形用户界面（GUI）或基于窗口的应用程序的API。Swing是一个平台无关的框架，也就是说，Swing的组件在不同的平台上有相同的外观和行为。Swing是轻量级的，也就是说，它的组件不使用底层操作系统的资源，而是由Java本身绘制。
// Swing提供了一些高级的GUI组件，如表格、树、选项卡、滑块、进度条、工具栏等，以及一些用于绘制图形和图像的类，如JPanel、JLabel、JButton等。 Swing还提供了一些用于布局管理、事件处理、拖放、撤销/重做、打印等功能的类。
// Swing是Java后来提供的GUI框架，它基于AWT，但是比AWT更强大和灵活。 Swing也可以和JavaFX一起使用，以实现更丰富和现代化的GUI应用程序。

//g AWT和Swing是Java的两种GUI框架，它们都可以用来创建图形用户界面或基于窗口的应用程序，但是它们之间也有一些区别和联系。
// AWT和Swing的区别主要有以下几点：
// AWT是基于本地方法的C/C++程序，其运行速度比较快；Swing是基于AWT的Java程序，其运行速度比较慢。
// AWT的控件是平台相关的，也就是说，它们的显示会根据操作系统的视觉效果而变化；Swing的控件是平台无关的，也就是说，它们在所有平台上有相同的外观和行为。
// AWT是重量级的，也就是说，它的控件使用了底层操作系统的资源；Swing是轻量级的，也就是说，它的控件不使用底层操作系统的资源，而是由Java本身绘制。
// AWT提供了一些基本的GUI控件，如按钮、文本框、标签、复选框、单选按钮、列表、菜单等；Swing提供了一些高级的GUI控件，如表格、树、选项卡、滑块、进度条、工具栏等。
//g AWT和Swing的联系主要有以下几点：
// Swing是在AWT的基础上构建的一套新的图形界面系统，它提供了AWT所能够提供的所有功能，并且用纯粹的Java代码对AWT的功能进行了大幅度的扩充。
// Swing使用了AWT中所提供的基本作图方法和事件处理机制，也继承了AWT中一些重要的类和接口，如Component、Container、Graphics、LayoutManger等。
// Swing可以和AWT混合使用，也就是说，在一个Swing应用程序中可以嵌入一些AWT控件，反之亦然。

// p ----------------------------------------------容器组件
//o 容器组件是指可以容纳其他组件（如按钮、标签、文本框等）的组件。容器组件提供了一种方便的方式来组织和布局其他组件，以便在GUI中形成具有结构和意义的布局。
//g Java中常见的容器组件有以下几种：

//o JPanel：是一种通用的容器组件，它可以包含其他组件，并可以用于创建复杂的布局。
//o JFrame：是一种顶层窗口容器，它可以包含其他组件，通常用于创建具有标题栏、菜单栏、工具栏等的应用程序窗口。
// JDialog：是一种模态对话框容器，它可以用于显示消息、接受输入、进行选择等任务。
// JApplet：是一种用于创建Web应用程序的容器组件，它可以包含其他组件，并嵌入到Web页面中。
// JWindow  是 Swing库中的一种容器组件，它可以创建一个没有标题栏、边框和菜单的窗口，通常用于实现自定义的弹出窗口、工具提示窗口等。
//g 容器组件通常会提供一些布局管理器来帮助组织和布局其他组件，例如FlowLayout、BorderLayout、GridLayout等。布局管理器可以根据不同的布局需求来自动调整组件的位置和大小，从而简化布局的过程。

// b ------------顶层容器
// 顶层容器是一种容器组件，用来容纳其他的容器或组件，是图形界面程序的主窗口。在Swing中，有三种顶层容器，分别是JFrame、JDialog和JApplet。
// JFrame是用于创建框架窗口的类，它有标题栏、菜单栏和窗口管理按钮。JDialog是用于创建对话框的类，它可以是模态的或非模态的。 JApplet是用于创建Java小程序的类，它可以嵌入在浏览器中运行。 
// 顶层容器都包含一个JRootPane作为其唯一的子组件，JRootPane又包含了contentPane、glassPane和layeredPane
//o JFrame是Java Swing库中的一种容器组件，它可以创建一个带有标题栏、边框和菜单的窗口，通常用于创建具有用户交互的应用程序窗口。JFrame可以包含其他组件，例如按钮、标签、文本框等，以实现复杂的GUI界面。
// o JFrame构造方法如下：

// JFrame()：创建一个默认大小的JFrame对象。
// JFrame(String title)：创建一个指定标题的JFrame对象。
// JFrame(GraphicsConfiguration gc)：使用指定的GraphicsConfiguration对象创建一个JFrame对象。
// JFrame(String title, GraphicsConfiguration gc)：创建一个指定标题和GraphicsConfiguration对象的JFrame对象。

// 在创建JFrame对象后，可以使用setSize()、setLocation()、setTitle()等方法来设置窗口的大小、位置、标题等属性。如果需要在JFrame中添加其他组件，可以使用add()方法将组件添加到JFrame中。

//g 需要注意的是，JFrame默认的关闭按钮只是隐藏窗口，而不是真正的销毁窗口对象。如果需要销毁窗口对象，可以通过设置setDefaultCloseOperation()方法来实现。常见的销毁窗口对象的方法包括：

// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)：点击关闭按钮时退出应用程序。
// setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE)：点击关闭按钮时销毁窗口对象。
// setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE)：点击关闭按钮时不做任何操作，需要手动调用dispose()方法来销毁窗口对象。

// y ============ 以下是JFrame类中常用的一些方法：

//o void setBounds(int a,int b,int width,int height)：设置窗口的初始位置是(a,b)，即距屏幕左面a个像素，距屏幕上方b个像素，窗口的宽是width，高是height。
//o  setSize(int width, int height)：设置JFrame的宽度和高度。
// setLocation(int x, int y)：设置JFrame的位置，x和y表示JFrame的左上角坐标。
//o setTitle(String title)：设置JFrame的标题。
// setResizable(boolean resizable)：设置JFrame是否可调整大小。默认情况下，JFrame是可以被用户调整大小的。 你可以使用setResizable(false)来禁止用户改变窗口的大小
//o setVisible(boolean visible)：设置JFrame是否可见。
//o setBackground(Color color)是一个方法，用于设置组件的背景颜色。Color是一个类，表示颜色，可以用预定义的常量或自定义的RGB值来创建颜色对象。
// setBackground(Color.RED)：设置背景颜色为红色。
// setBackground(new Color(255, 255, 0))：设置背景颜色为黄色，RGB值为(255, 255, 0)。
//g setDefaultCloseOperation(int operation)：设置JFrame的关闭操作，operation参数如上

//o setContentPane()方法是JFrame类的一个方法，它用于设置JFrame的内容面板。内容面板是一个容器，它可以添加其他的组件，如按钮，标签，文本框等。setContentPane方法的参数是一个Container对象，通常是一个JPanel或JDesktopPane之类的中间容器。
//o getContentPane()：获取JFrame的内容面板对象，替代创建JPanel对象，可以通过该方法向JFrame中添加其他组件。
// frame.add(panel)和frame.setContentPane(panel)的区别是，前者是将panel添加到frame的默认内容面板上，而后者是将panel设置为frame的内容面板。frame的默认内容面板是一个JPanel，它使用BorderLayout布局管理器。
// 如果你不指定添加组件时的位置，它会默认添加到CENTER位置。但是CENTER位置只能有一个组件，所以如果你多次调用frame.add(panel)，只有最后一个panel会显示出来。
//o add(Component comp)：向JFrame的内容面板中添加组件。
// JFrame类是一个实现了RootPaneContainer接口的窗口容器，它有以下两种add方法：

// add(Component comp)：将组件comp添加到窗口的内容面板中。
// add(Component comp, Object constraints)：将组件comp添加到窗口的内容面板中，并指定布局约束constraints。属性为BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.EAST, BorderLayout.WEST或BorderLayout.CENTER，表示组件在容器中的五个区域之一
//o setLayout(LayoutManager manager)：设置JFrame的布局管理器，可以选择BorderLayout、FlowLayout、GridLayout等常见的布局管理器。
//g setJMenuBar(JMenuBar menuBar)：设置JFrame的菜单栏。
//g setIconImage(Image image)：设置JFrame的图标。
//o pack()：自适应 根据JFrame中的组件调整JFrame的大小。
// void setLocationRelativeTo(Component c)：设置窗口相对于指定组件的位置，如果组件为null，则相对于屏幕中心。
// b -------------------------内容窗格是一个容器，它可以放置在JFrame或其他容器中，用来显示组件和内容。

// 内容窗格通常是透明的，没有边框，它可以使用不同的布局管理器来安排组件的位置和大小。
//o 你可以使用getContentPane()方法来获取JFrame的内容窗格，然后使用add()方法向内容窗格中添加组件。
//w JFrame frame = new JFrame("My Frame"); //创建一个JFrame对象

//w JButton button = new JButton("Click Me"); //创建一个JButton对象
//w frame.getContentPane().add(button); //向内容窗格中添加按钮
//o 你也可以使用setContentPane()方法来设置JFrame的内容窗格为一个自定义的JPanel对象。
//w JFrame frame = new JFrame("My Frame"); //创建一个JFrame对象

//w JPanel panel = new JPanel(); //创建一个JPanel对象
//w JButton button = new JButton("Click Me"); //JButton对象
//w panel.add(button); //向面板中添加按钮
//w frame.setContentPane(panel); // 将面板设置为内容窗格

//g 布局管理器是一种用来控制容器中组件的位置和大小的工具。布局管理器可以根据容器的大小和形状，自动调整组件的位置和大小，使得界面看起来更美观和合理。

// b ----------------------------面板是一种用来创建图形用户界面(GUI)的组件，它是javax.swing.JPanel类的实例，可以放置其他的组件，如按钮、标签、文本框等。
// Java Swing 面板可以设置不同的布局管理器，来控制组件的位置和大小。常用的布局管理器有FlowLayout、BorderLayout、GridLayout、BoxLayout等
// JPanel 类的常用构造方法如下：
// JPanel ()：使用默认的布局管理器创建新面板，默认的布局管理器为 FlowLayout。
// JPanel (LayoutManager layout)：创建指定布局管理器的 JPanel 对象。
// w JPanel panel = new JPanel(new BorderLayout());//简写

// y 使用 javax.swing.JScrollPane 类来创建带滚动条面板，它是一种轻量级的容器，可以放置其他的组件，如文本区域、表格、树等。
// JScrollPane 类的常用构造方法如下：

// JScrollPane ()：创建一个空的带滚动条面板。
// JScrollPane (Component view)：创建一个包含指定组件的带滚动条面板。
//w JTextArea textArea = new JTextArea(20, 20); //创建一个文本区域
//w JScrollPane scrollPane = new JScrollPane(textArea); //创建一个带滚动条面板，并将文本区域作为其视图组件

// g JScrollPane 类的常用方法如下：
//o setViewportView(Component view)：设置带滚动条面板的视图组件。

//o setHorizontalScrollBarPolicy(int policy)：设置水平滚动条的显示策略，
// 可选值有 
// JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED（默认）、=30
// JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS 总是显示 =31
// 和 JScrollPane.HORIZONTAL_SCROLLBAR_NEVER。不显示 =32
//o setVerticalScrollBarPolicy(int policy)：设置垂直滚动条的显示策略，
// 可选值有 
// JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED（默认）、
// JScrollPane.VERTICAL_SCROLLBAR_ALWAYS 总是显示
//  和 JScrollPane.VERTICAL_SCROLLBAR_NEVER。不显示

// getHorizontalScrollBar()：返回水平滚动条对象。
// getVerticalScrollBar()：返回垂直滚动条对象。

// o AWT 滚动条组件是 java.awt.Scrollbar 类的实例，它是一种用来在指定的取值范围内快速选取某一值的功能。12

// AWT 滚动条组件可以设置为水平或垂直方向，也可以设置其最小值，最大值，当前值，可见数量和单位增量等属性。12
// AWT 滚动条组件实现了 Adjustable 接口，因此可以添加 AdjustmentListener 来监听滚动条的变化事件。12
// AWT 滚动条组件的常用构造方法如下：

// Scrollbar()：创建一个新的垂直滚动条。
// Scrollbar(int orientation)：创建一个指定方向的新滚动条。
// Scrollbar(int orientation, int value, int visible, int minimum, int maximum)：创建一个具有指定方向，初始值，可见数量以及最小值和最大值的新滚动条。
//g orientation的值
// Scrollbar.HORIZONTAL：值为0 表示水平滚动条，即滚动条的方向为从左到右。
// Scrollbar.VERTICAL：值为1 表示垂直滚动条，即滚动条的方向为从上到下。
//w Scrollbar scrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 50, 10, 0, 100); //创建一个水平滚动条，初始值为 50，可见数量为 10，最小值为 0，最大值为 100

// p -------------------标签 按钮是在java图形界面中使用的组件，可以显示文本或图标，并且可以触发动作事件。
// java标签和按钮组件是指在java图形界面中使用的两种常见的展示类组件。
// 标签组件是JLabel类的对象，可以显示文本和图片，但不可交互。
// 按钮组件是JButton类的对象，可以显示文本或图标，并且可以触发动作事件 可以用不同的构造方法创建，并且可以用JButton类提供的方法进行设置和监听
// b -------------------JLabel标签
//o JLabel类有以下六种构造方法：

// JLabel()：创建一个没有图像和标题为空字符串的JLabel实例。
// JLabel(String text)：使用指定的文本创建JLabel实例。
// JLabel(Icon image)：使用指定的图标创建JLabel实例。

// JLabel(String text, int horizontalAlignment)：使用指定的文本和水平对齐方式创建JLabel实例。水平对齐方式可以是 JLabel.LEFT 、 JLabel.CENTER 或 JLabel.RIGHT。
// JLabel(Icon image, int horizontalAlignment)：使用指定的图标和水平对齐方式创建JLabel实例。水平对齐方式可以是 JLabel.LEFT 、 JLabel.CENTER 或 JLabel.RIGHT。
// JLabel(String text, Icon icon, int horizontalAlignment)：使用指定的文本、图标和水平对齐方式创建JLabel实例。水平对齐方式可以是 JLabel.LEFT 、 JLabel.CENTER 或 JLabel.RIGHT。
// JLabel.LEFT = 2
// JLabel.CENTER = 0
// JLabel.RIGHT = 4
// o JLabel类有两个方法可以设置标签内容的水平和垂直对齐方式：

// setHorizontalAlignment(int alignment)：设置标签内容沿X轴的对齐方式。alignment参数可以是SwingConstants接口中定义的常量，如 LEFT、CENTER、RIGHT、LEADING 或TRAILING。
// setVerticalAlignment(int alignment)：设置标签内容沿Y轴的对齐方式。alignment参数可以是SwingConstants接口中定义的常量，如TOP、CENTER 或 BOTTOM。
// g SwingConstants接口中的常量值如下：
// 逆时针
//w LEFT = 2
//w CENTER = 0
//w RIGHT = 4
//w TOP = 1
//w BOTTOM = 3

//w LEADING = 10
//w TRAILING = 11
//w HORIZONTAL = 0
//w VERTICAL = 1
// 顺时针
//w NORTH = 1
//w SOUTH = 5
//w EAST = 3
//w WEST = 7
//w NORTH_EAST = 2
//w NORTH_WEST = 8
//w SOUTH_EAST = 4
//w SOUTH_WEST = 6

// b -------------------JButton按钮
// JButton类是用于创建一个带有文本或图标的按钮，可以响应用户的点击事件的类。它继承了AbstractButton类，实现了Accessible接口
// 普通按钮（JButton）：最常见的按钮，可以显示文本或图标，或者两者都有，可以触发一些动作或事件；
// 切换按钮（JToggleButton）：一种有两种状态的按钮，选中或未选中，可以显示文本或图标，或者两者都有，可以用来切换某些选项的开关；
// 复选按钮（JCheckBox）：一种有两种状态的按钮，选中或未选中，通常显示一个方框和一些说明性文字，可以用来实现多选功能；
// 单选按钮（JRadioButton）：一种有两种状态的按钮，选中或未选中，通常显示一个圆圈和一些说明性文字，可以用来实现单选功能，通常需要和按钮组（ButtonGroup）一起使用。
//g 这些按钮都是从AbstractButton类继承而来的，所以它们有一些共同的属性和方法它定义了按钮和菜单项的共同行为。
// 它是JButton，JToggleButton，JCheckBox等类的父类。它实现了ItemSelectable和SwingConstants接口。它有一些属性和方法来控制按钮的外观和功能，例如：
// setIcon(Icon icon): 设置按钮的图标；
// setMnemonic(int mnemonic): 设置按钮的快捷键；
// setSelected(boolean selected): 设置按钮的选中状态；
// addActionListener(ActionListener listener): 添加按钮的动作监听器；
// isSelected(): 返回按钮是否被选中
//o JButton类有以下四种构造方法：

// JButton()：创建一个空按钮。
// JButton(String text)：创建一个带有文本标签的按钮。
// JButton(Icon icon)：创建一个带有图标的按钮。
// JButton(String text, Icon icon)：创建一个带有文本和图标的按钮

//o JButton类有以下一些常用的方法：

// setText(String text)：设置按钮上的文本。
// getText()：返回按钮上的文本。
// setIcon(Icon icon)：设置按钮上的图标。
// getIcon()：返回按钮上的图标。
// setEnabled(boolean enabled)：设置按钮是否可用。
// isEnabled()：返回按钮是否可用。
// setMnemonic(int mnemonic)：设置按钮的助记键。
// getMnemonic()：返回按钮的助记键。

// addActionListener(ActionListener listener)：为按钮添加动作监听器。
// removeActionListener(ActionListener listener)：移除按钮的动作监听器 

// b ---------------切换按钮、复选按钮和单选按钮是Java Swing中的三种常用的按钮组件，它们都继承了AbstractButton类，可以响应用户的选择事件。它们的区别和用法如下：
// 切换按钮、复选按钮和单选按钮都需要添加到容器中进行布局，同时也需要添加动作监听器或项目监听器来处理用户的选择事件。另外，单选按钮还需要添加到一个按钮组（ButtonGroup）中，以实现单选的逻辑。

// 切换按钮（JToggleButton）是一种可以保持两种状态（选中或未选中）的按钮，用户点击一次切换一次状态。切换按钮可以用来表示开关、模式等功能。
// 复选按钮（JCheckBox）是一种可以多选的按钮，用户可以选择或取消选择任意个复选按钮。复选按钮通常用来表示多个可选的属性或功能。
// 单选按钮（JRadioButton）是一种只能单选的按钮，用户只能选择一个单选按钮，选择另一个时前一个会自动取消。单选按钮通常用来表示互斥的选项或功能。
// y 切换按钮（JToggleButton）构造方法
// JToggleButton()：创建一个没有文本和图标的切换按钮，初始状态为未选中。
// JToggleButton(String text)：创建一个带有文本的切换按钮，初始状态为未选中。
// JToggleButton(Icon icon)：创建一个带有图标的切换按钮，初始状态为未选中。
// JToggleButton(String text, Icon icon)：创建一个带有文本和图标的切换按钮，初始状态为未选中。

// JToggleButton(String text, boolean selected)：创建一个带有文本的切换按钮，初始状态由selected参数指定。
// JToggleButton(Icon icon, boolean selected)：创建一个带有图标的切换按钮，初始状态由selected参数指定。
// JToggleButton(String text, Icon icon, boolean selected)：创建一个带有文本和图标的切换按钮，初始状态由selected参数指定
// y 复选按钮（JCheckBox）
// JCheckBox()：创建一个没有文本和图标的复选按钮，初始状态为未选中。
// JCheckBox(String text)：创建一个带有文本的复选按钮，初始状态为未选中。
// JCheckBox(Icon icon)：创建一个带有图标的复选按钮，初始状态为未选中。
// JCheckBox(String text, Icon icon)：创建一个带有文本和图标的复选按钮，初始状态为未选中。

// JCheckBox(String text, boolean selected)：创建一个带有文本的复选按钮，初始状态由selected参数指定。
// JCheckBox(Icon icon, boolean selected)：创建一个带有图标的复选按钮，初始状态由selected参数指定。
// JCheckBox(String text, Icon icon, boolean selected)：创建一个带有文本和图标的复选按钮，初始状态由selected参数指定

//y  单选按钮（JRadioButton）
// JRadioButton()：创建一个没有文本和图标的单选按钮，初始状态为未选中。
// JRadioButton(String text)：创建一个带有文本的单选按钮，初始状态为未选中。
// JRadioButton(Icon icon)：创建一个带有图标的单选按钮，初始状态为未选中。
// JRadioButton(String text, Icon icon)：创建一个带有文本和图标的单选按钮，初始状态为未选中。

// JRadioButton(String text, boolean selected)：创建一个带有文本的单选按钮，初始状态由selected参数指定。
// JRadioButton(Icon icon, boolean selected)：创建一个带有图标的单选按钮，初始状态由selected参数指定。
// JRadioButton(String text, Icon icon, boolean selected)：创建一个带有文本和图标的单选按钮，初始状态由selected参数指定

// p -------------------Java布局管理器是一种类，用于在容器内组织元素。每个组件的大小和位置由布局管理器根据一些变量决定，包括组件的首选大小、容器的大小和任何指定的布局约束
// Java提供了多种布局管理器，例如BorderLayout、BoxLayout、CardLayout、FlowLayout、GridBagLayout、GridLayout、GroupLayout和SpringLayout等。
// 不同的布局管理器有不同的特点和用途，你可以根据你的GUI设计需求选择合适的布局管理器。

// FlowLayout 流式布局：将组件按照从左到右，从上到下的顺序排列，如果一行放不下，则换行继续放置。jpanel默认
// BorderLayout 边框布局：将容器分为五个区域，北、南、东、西和中，每个区域只能放置一个组件。顶层默认
// GridLayout、网格布局：将容器分为若干个网格，每个网格只能放置一个组件，所有组件的大小相同。
// GridBagLayout：将容器分为若干个网格，每个网格可以放置一个或多个组件，每个组件可以占据一个或多个网格，组件的大小可以不同。
// CardLayout 卡片布局：将容器分为若干个层次，每个层次只能放置一个组件，只有最上层的组件可见，可以通过按钮或菜单切换不同层次的组件。
// 盒式布局(BoxLayout)

// b  FlowLayout 流式布局：将组件按照从左到右，从上到下的顺序排列，如果一行放不下，则换行继续放置。jpanel默认
//o FlowLayout有三个构造方法，分别是：
// FlowLayout ()：创建一个居中对齐，水平和垂直间隙为默认5单位的流布局。
// FlowLayout (int align)：创建一个指定对齐方式，水平和垂直间隙为默认5单位的流布局。对齐方式可以是LEFT、RIGHT、CENTER、LEADING或TRAILING。
// FlowLayout (int align, int hgap, int vgap)：创建一个指定对齐方式，水平和垂直间隙的流布局。hgap和vgap分别表示组件之间的水平 和垂直间隙。

//b BorderLayout 边框布局：将容器分为五个区域，北、南、东、西和中，每个区域只能放置一个组件。顶层默认
// BorderLayout用于将组件按照五个区域（north、south、east、west和center）来排列和调整大小，以适应容器。每个区域最多只能包含一个组件，并且由相应的常量（NORTH、SOUTH、EAST、WEST和CENTER）来标识。
//o BorderLayout 的常用构造方法如下：

// BorderLayout ()：创建一个水平和垂直间隙为默认0单位的边框布局。
// BorderLayout (int hgap, int vgap)：创建一个指定水平和垂直间隙的边框布局。hgap和vgap分别表示组件之间的水平和垂直间隙。
// BorderLayout (LayoutManager layout)：创建一个指定布局管理器的边框布局。layout可以是任何实现了LayoutManager接口的类的实例

// b gridlayout是一种布局管理器，它可以把一个容器分割成等大小的矩形网格，并把每个组件放在一个网格中。
// 你可以通过new GridLayout(rows, cols)来创建一个指定行数和列数的gridlayout对象，然后通过setLayout(gridlayout)来把一个容器设置为使用gridlayout布局，然后通过add(component)来向容器中添加组件。
// 你还可以通过setHgap(hgap)和setVgap(vgap)来设置网格之间的水平和垂直间隙，通过getRows()和getColumns()来获取网格的行数和列数

// o gridlayout有三个构造器，分别是：

// GridLayout()：创建一个默认的gridlayout，每行只有一列。
// GridLayout(int rows, int cols)：创建一个指定行数和列数的gridlayout，如果行数或列数为0，表示可以放置任意数量的组件。
// GridLayout(int rows, int cols, int hgap, int vgap)：创建一个指定行数、列数、水平间隙和垂直间隙的gridlayout。

// b CardLayout是一种布局管理器，它可以让一个容器中的多个组件像一叠卡片一样切换显示，每次只有一个组件可见。
// 你可以通过new CardLayout()或new CardLayout(hgap, vgap)来创建一个CardLayout对象，然后通过setLayout(cardlayout)来把一个容器设置为使用CardLayout布局，然后通过add(component, name)来向容器中添加组件，并给每个组件指定一个名称。
// 你还可以通过show(container, name)来显示指定名称的组件，或者通过next(container)和previous(container)来切换到下一个或上一个组件

// o CardLayout的构造器
// CardLayout()：创建一个默认的CardLayout，没有水平和垂直间隙。
// CardLayout(int hgap, int vgap)：创建一个指定水平和垂直间隙的CardLayout，间隙是组件之间的空白距离。

// o CardLayout的常用方法有以下几个：

// void addLayoutComponent(String name, Component comp)：向CardLayout中添加一个组件，并给它指定一个名称，这个名称用于后续的切换操作。直接cardobj.add()也可以

// void show(Container parent, String name)：在CardLayout中显示指定名称的组件，如果没有这个名称的组件，则不做任何操作。
// void first(Container parent)：在CardLayout中显示第一个组件。
// void last(Container parent)：在CardLayout中显示最后一个组件。
// void next(Container parent)：在CardLayout中显示下一个组件，如果当前是最后一个组件，则显示第一个组件。
// void previous(Container parent)：在CardLayout中显示上一个组件，如果当前是第一个组件，则显示最后一个组件。

// b BoxLayout是一种布局管理器，它可以让一个容器中的多个组件按照水平或垂直方向排列，组件之间不会换行。
// 你可以通过new BoxLayout(container, axis)来创建一个BoxLayout对象，其中container是要使用BoxLayout的容器，axis是指定排列方向的常量，可以是BoxLayout.X_AXIS, BoxLayout.Y_AXIS, BoxLayout.LINE_AXIS或BoxLayout.PAGE_AXIS。然后通过setLayout(boxlayout)来把一个容器设置为使用BoxLayout布局，然后通过add(component)来向容器中添加组件。
// 你还可以通过Box类提供的一些静态方法来创建一些特殊的组件，如空白区域、填充区域、分隔线等

// o BoxLayout有一个构造方法，它是：

// BoxLayout(Container target, int axis)：创建一个指定容器和排列方向的BoxLayout对象，其中target是要使用BoxLayout的容器，axis是指定排列方向的常量，可以是
//o BoxLayout.X_AXIS, BoxLayout.Y_AXIS, BoxLayout.LINE_AXIS或BoxLayout.PAGE_AXIS。
// BoxLayout.X_AXIS：表示组件按照水平方向从左到右排列。
// BoxLayout.Y_AXIS：表示组件按照垂直方向从上到下排列。
// BoxLayout.LINE_AXIS：表示组件按照容器的ComponentOrientation属性来排列，如果容器是水平方向的，那么组件就按照水平方向排列，如果容器是垂直方向的，那么组件就按照垂直方向排列。水平方向的容器中，如果ComponentOrientation是从左到右的，那么组件就从左到右排列，如果是从右到左的，那么组件就从右到左排列。
// BoxLayout.PAGE_AXIS：表示组件按照容器的ComponentOrientation属性来排列，如果容器是水平方向的，那么组件就按照垂直方向排列，如果容器是垂直方向的，那么组件就按照水平方向排列。水平方向的容器中，如果ComponentOrientation是从左到右的，那么组件就从左到右排列，如果是从右到左的，那么组件就从右到左排列。
// BoxLayout.X_AXIS：0
// BoxLayout.Y_AXIS：1
// BoxLayout.LINE_AXIS：2
// BoxLayout.PAGE_AXIS：3



import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;

public class Gui {

    public static void main(String[] args) {

        new sw();// 淦

    }
}

class sw {
    sw() {
        // JFrame对象
        JFrame frame = new JFrame("赛博喵喵2077");
        // 创建一个边框布局管理器
        BorderLayout layout = new BorderLayout();
        // o 为窗口设置布局管理器 可省略
        frame.setLayout(layout);
        // 创建五个面板，分别对应五个区域
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        // 创建五个标签
        JLabel label1 = new JLabel("血肉苦弱");
        JLabel label2 = new JLabel("机械飞升");
        JLabel label3 = new JLabel("赛博喵喵");
        JLabel label4 = new JLabel("欢迎来到");
        JLabel label5 = new JLabel("末日世界");
        // 将标签添加到对应的面板上
        panel1.add(label1);
        panel2.add(label2);
        panel3.add(label3);
        panel4.add(label4);
        panel5.add(label5);
        // o 将面板添加到布局管理器 窗口的对应区
        // frame.add(panel)//简写
        // frame.setContentPane(panel)//满血版
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.CENTER);
        frame.add(panel4, BorderLayout.WEST);
        frame.add(panel5, BorderLayout.EAST);
        // 设置窗口的其他属性
        frame.setSize(400, 400); // 设置窗口的大小
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗口的关闭操作
        frame.setVisible(true); // 设置窗口的可见性
        frame.setLocationRelativeTo(null);// 设置窗口居中

    }
}
