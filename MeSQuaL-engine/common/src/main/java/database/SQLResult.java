/*
 *     This file is part of MeSQuaL.
 *
 *     MeSQuaL is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     MeSQuaL is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with MeSQuaL. If not, see <https://www.gnu.org/licenses/>.
 */

package database;

import java.nio.file.Path;
import java.sql.ResultSet;
import java.util.List;

public class SQLResult {
    private ResultSet sqlQueryResults;
    private List<Path> outputFilesPaths;

    public SQLResult(ResultSet sqlQueryResults, List<Path> paths) {
        this.sqlQueryResults = sqlQueryResults;
        this.outputFilesPaths = paths;
    }

    public ResultSet getSqlQueryResults() {
        return sqlQueryResults;
    }

    public void setSqlQueryResults(ResultSet sqlQueryResults) {
        this.sqlQueryResults = sqlQueryResults;
    }

    public List<Path> getOutputFilesPaths() {
        return outputFilesPaths;
    }

    public void setOutputFilesPaths(List<Path> outputFilesPaths) {
        this.outputFilesPaths = outputFilesPaths;
    }
}
