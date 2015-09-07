/**
 * Copyright 2010-2015 Axel Fontaine
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flywaydb.core.internal.dbsupport;

public class SqlLogOutputService {

    public String getLogOutputBasedOnSql(final String sql, final int rowsChanged) {
        String logOutput = "No rows changed.\n";
        if (sql == null) {
            return logOutput;
        } else if (sql.toUpperCase().startsWith("INSERT")) {
            logOutput = rowsChanged + " row(s) inserted.\n";
        } else if (sql.toUpperCase().startsWith("UPDATE")) {
            logOutput = rowsChanged + " row(s) updated.\n";
        } else if (sql.toUpperCase().startsWith("DELETE")) {
            logOutput = rowsChanged + " row(s) deleted.\n";
        }

        return logOutput;
    }
}
