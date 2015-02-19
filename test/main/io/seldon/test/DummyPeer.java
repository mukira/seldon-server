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

package io.seldon.test;

import javax.jdo.PersistenceManager;

/**
 * Since Peers don't currently inherit from a GenericPeer class, we can use this dummy to simplify bean creation.
 * <p/>
 * (A better solution would be to refactor.)
 * <p/>
 * Created by: marc on 08/08/2011 at 14:37
 */
public abstract class DummyPeer {

    @SuppressWarnings({"unused"})
    public DummyPeer(PersistenceManager persistenceManager) {
    }

}