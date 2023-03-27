package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerRoutineInfo {
    @Tag(tag=2) public Integer routineType = null;
    @Tag(tag=13) public Integer finishedNum = null;
}
