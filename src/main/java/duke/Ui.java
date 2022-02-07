package duke;

import duke.task.Task;
import duke.task.TaskList;

import java.util.ArrayList;

public class Ui {

    private Ui() {

    }

    private static final String MSG_LINE_SEPARATOR = "____________________________________________________________\n";

    public static void printWelcome() {
        print("Hello! I'm DatoDato! Your personal helper bot. :) \n" + "What can I do for you?");
    }

    public static void printExit() {
        print("Bye! Checkout another cool bot @KatoKatoBot on Telegram.\n" + "Hope to see you again soon!)");
    }

    public static final String MSG_EMPTYINPUT = "☹ OOPS!!! I'm sorry, input cannot be empty!";

    public static final String MSG_INVALDTASKIDFORMAT = "☹ OOPS!!! I'm sorry, taskId should be a number. " + "You can use the list duke.command to find the tasks.";

    public static final String MSG_INVALIDCMD = "☹ OOPS!!! I'm sorry, but I don't know what that means!";

    public static final String MSG_INVALIDTASKID = "☹ OOPS!!! I'm sorry, task not found! Please select a task in " + "range. You can use the list duke.command to find the tasks.";

    public static final String MSG_INVLIADCMDFORMAT = "☹ OOPS!!! I'm sorry, your formatting for your message isn't right!";

    public static final String MSG_TASKALREADYDONE = "☹ OOPS!!! task.Task already completed!";

    public static final String MSG_EMPTYTASK = "☹ OOPS!!! No task exists!";

    public static final String MSG_FILEREADERROR = "☹ OOPS!!! There was an error loading the file.";

    public static final String MSG_INVALIDDATETIMEFORMAT = "☹ OOPS!!! Wrong format for Date or Time. " + "Please use [dd-MM-yyyy HH:mm] format. i.e. 30-05-1959 13:59";

    public static final String MSG_INVALIDDATETIME = "☹ OOPS!!! You can't set a task in the past!";

    public static final String MSG_FILEWRITEERROR = "☹ OOPS!!! We can't save your records! This is likely due to write permissions on your system.";

    public static String taskListMsg(TaskList taskList) {
        ArrayList<Task> tasks = taskList.getTaskList();
        StringBuffer result = new StringBuffer("Here are the tasks in your list: \n");
        for (int i = 1; i <= tasks.size(); i++) {
            result.append(String.format("%d.%s", i, tasks.get(i - 1)));
            if (i != tasks.size()) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    public static String completeTaskMsg(String description) {
        return "Nice! I've marked this task as done: \n  " + description;
    }

    public static String deleteTaskMsg(String description, int totalTask) {
        return String.format("Noted. I've removed this task: \n  %s\nNow you have %d tasks in the list.", description, totalTask);
    }

    public static String addTaskMsg(String description, int totalTask) {
        return String.format("Got it. I've added this task:\n  %s\nNow you have %d tasks in the list.", description, totalTask);
    }

    public static void print(String input) {
        System.out.println(MSG_LINE_SEPARATOR + input + "\n" + MSG_LINE_SEPARATOR);
    }
}