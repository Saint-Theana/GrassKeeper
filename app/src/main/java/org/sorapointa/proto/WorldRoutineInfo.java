package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WorldRoutineInfo {
    @Tag(tag=4) public Integer progress = null;
    @Tag(tag=14) public Boolean isFinished = null;
    @Tag(tag=3) public Integer finishProgress = null;
    @Tag(tag=11) public Integer routineId = null;
}
