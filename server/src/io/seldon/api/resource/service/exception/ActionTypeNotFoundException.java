/*
 * Seldon -- open source prediction engine
 * =======================================
 *
 * Copyright 2011-2015 Seldon Technologies Ltd and Rummble Ltd (http://www.seldon.io/)
 *
 * ********************************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ********************************************************************************************
 */

package io.seldon.api.resource.service.exception;

/**
 * Created by: marc on 24/08/2011 at 10:38
 */
public class ActionTypeNotFoundException extends Exception {

    private static final long serialVersionUID = 6524300245498185351L;
    
    private String consumerShortName;
    private String actionTypeName;

    public ActionTypeNotFoundException(String message) {
        super(message);
    }

    public ActionTypeNotFoundException(String consumerShortName, String actionTypeName) {
        super("No such action type: '" + actionTypeName + "' for client: " + consumerShortName);
        this.consumerShortName = consumerShortName;
        this.actionTypeName = actionTypeName;
    }

    public String getConsumerShortName() {
        return consumerShortName;
    }

    public String getActionTypeName() {
        return actionTypeName;
    }
}

