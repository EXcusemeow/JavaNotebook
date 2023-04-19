package test;
//  o 导入swing gui 组件
import javax.swing.*;

//r HelloWorldSwing
public class NoteSwing {
    /**
     * r Create the GUI and show it. For thread线程 safety,this method should be
     * invoked调用 from the event-dispatching事件调度 thread.
     */
    private static void createAndShowGUI() {

        // r Create and set up the window.
        JFrame frame = new JFrame("可视化Gui");

        // r 设置用户在此帧上启动 “关闭” 时默认情况下将发生的操作。您必须指定以下选项之一:
        // “DO_NOTHING_ON_CLOSE” (在 “windowconsts' 中定义): 不做任何事情; 要求程序处理已注册的“
        // windowlistener” 对象的 “windowclosing” 方法中的操作。
        // o “HIDE_ON_CLOSE” (在 “windowconsts窗口常数” 中定义): 在调用任何已注册的 “窗口列表” 对象后，自动隐藏框架。
        // “DISPOSE_ON_CLOSE” (在 “windowconsts' 中定义): 在调用任何已注册的“ windowlistener”
        // 对象后，自动隐藏并处置框架。
        // r 'Exit_on_close '(在 'windowconsts' 中定义): 使用 'System' 退出'
        // 方法退出应用程序。仅在应用程序中使用此。
        // o 默认情况下，该值设置为 “HIDE_ON_CLOSE”。更改此属性的值会触发属性更改事件，属性名称为 “defaultCloseOperation”。
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // y 窗口大小替换自适应frame.pack()
        frame.setSize(400, 400);
        // Add the 万恶之源 "Hello World" label.标签
        JLabel label = new JLabel("看什么看你知道的太多了");
        // 水平-垂直居中对齐
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        // r 获取内容窗格添加组件
        frame.getContentPane().add(label);
        // o 自适应包装
        // y frame.pack();
        // o 设置可见
        frame.setVisible(true);
        
    }

    public static void main(String[] args) {
        // o Schedule安排 a job for the event-dispatching 事件调度thread:
        // creating and showing this application's应用程序 GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // r 创建显示gui
                createAndShowGUI();

            }
        });
    }
}