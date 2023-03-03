package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WorldRoutineInfo.*;
import org.sorapointa.proto.WorldRoutineInfo;

public class WorldRoutineChangeNotify {
    @Tag(tag=3) public WorldRoutineInfo routineInfo = null;
    @Tag(tag=11) public Integer routineType = null;
}
