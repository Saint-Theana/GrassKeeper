package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampV3ShadowLevelInfo {
    @Tag(tag=2) public Integer levelId = null;
    @Tag(tag=7) public Boolean isOpen = null;
    @Tag(tag=12) public Integer minFinishTime = null;
}
