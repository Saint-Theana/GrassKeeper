package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlossomScheduleInfo {
    @Tag(tag=6) public Integer refreshId = null;
    @Tag(tag=9) public Integer state = null;
    @Tag(tag=1) public Integer circleCampId = null;
    @Tag(tag=12) public Integer finishProgress = null;
    @Tag(tag=14) public Integer round = null;
    @Tag(tag=15) public Integer progress = null;
}
