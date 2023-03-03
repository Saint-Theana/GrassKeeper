package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BartenderLevelInfo {
    @Tag(tag=7) public Boolean isFinish = null;
    @Tag(tag=9) public Integer maxScore = null;
    @Tag(tag=4) public Integer id = null;
}
