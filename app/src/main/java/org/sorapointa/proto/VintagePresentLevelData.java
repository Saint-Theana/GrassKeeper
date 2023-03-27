package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintagePresentLevelData {
    @Tag(tag=2) public Boolean isOpen = null;
    @Tag(tag=7) public Integer stageId = null;
    @Tag(tag=5) public Integer presentId = null;
    @Tag(tag=3) public Boolean isFinish = null;
}
