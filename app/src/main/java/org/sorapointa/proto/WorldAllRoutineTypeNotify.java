package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WorldRoutineTypeInfo.*;
import org.sorapointa.proto.WorldRoutineTypeInfo;

public class WorldAllRoutineTypeNotify {
    @Tag(tag=12) public List<WorldRoutineTypeInfo> worldRoutineTypeList = new ArrayList<>();
}
