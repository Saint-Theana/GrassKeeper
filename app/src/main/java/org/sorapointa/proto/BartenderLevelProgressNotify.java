package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BartenderLevelProgressNotify {
    @Tag(tag=9) public Boolean isNewRecord = null;
    @Tag(tag=3) public Boolean isFinish = null;
    @Tag(tag=15) public Integer levelId = null;
    @Tag(tag=8) public Integer score = null;
}
