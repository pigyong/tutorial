package com.tutorial.applicationservice.directive.command;

import com.tutorial.framework.cqrs.CQRSCommand;

public interface MenusDeletedCommand extends CQRSCommand {

    String name();
}
