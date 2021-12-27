package com.tutorial.applicationservice.directive.command;

import com.tutorial.framework.cqrs.CQRSCommand;

public interface MenusSaveCommand extends CQRSCommand {

    String name();

    String url();

    String icon();

    String description();

    String series();
}
