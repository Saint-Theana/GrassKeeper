package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GravenInnocencePhotoStageInfo {
    @Tag(tag=12) public Integer stageId = null;
    @Tag(tag=5) public Boolean isFinished = null;
    @Tag(tag=13) public Boolean isOpen = null;
}
