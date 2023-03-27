package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BartenderLevelInfo {
    @Tag(tag=13) public Boolean isFinish = null;
    @Tag(tag=12) public Integer maxScore = null;
    @Tag(tag=10) public Integer id = null;
}
