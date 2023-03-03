package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintagePresentLevelData {
    @Tag(tag=10) public Integer presentId = null;
    @Tag(tag=11) public Boolean isOpen = null;
    @Tag(tag=5) public Boolean isFinish = null;
    @Tag(tag=1) public Integer stageId = null;
}
