package seedu.address.logic.commands;

import seedu.address.logic.CommandHistory;
import seedu.address.logic.commands.Command;
import seedu.address.logic.commands.CommandResult;
import seedu.address.model.Model;

public class LogoutCommand extends Command {

    public static final String COMMAND_WORD = "logout";
    public static final String MESSAGE_SUCCESS = "logout success!";
    public static final String MESSAGE_FAILURE = "logout failed!";

    public static final String MESSAGE_USAGE = COMMAND_WORD + "Logout used to get out of admin mode.\n"
            + "Example: logout\n";


    @Override
    public CommandResult execute(Model model, CommandHistory history) {
        return new CommandResult(MESSAGE_SUCCESS);
    }

    @Override
    public boolean equals(Object other) {
        return this == other
                || other instanceof LogoutCommand; // instanceof handles nulls

    }

}