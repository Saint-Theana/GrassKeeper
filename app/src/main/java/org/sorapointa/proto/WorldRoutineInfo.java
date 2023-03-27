package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WorldRoutineInfo {
    @Tag(tag=9) public Boolean isFinished = null;
    @Tag(tag=15) public Integer finishProgress = null;
    @Tag(tag=5) public Integer progress = null;
    @Tag(tag=4) public Integer routineId = null;
}
