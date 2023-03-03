package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerRoutineInfo.*;
import org.sorapointa.proto.PlayerRoutineInfo;

public class PlayerRoutineDataNotify {
    @Tag(tag=11) public List<PlayerRoutineInfo> routineInfoList = new ArrayList<>();
}
