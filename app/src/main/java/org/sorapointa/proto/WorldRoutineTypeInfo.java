package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WorldRoutineInfo.*;
import org.sorapointa.proto.WorldRoutineInfo;

public class WorldRoutineTypeInfo {
    @Tag(tag=13) public Integer routineType = null;
    @Tag(tag=15) public Integer nextRefreshTime = null;
    @Tag(tag=6) public List<WorldRoutineInfo> worldRoutineInfoList = new ArrayList<>();
}
