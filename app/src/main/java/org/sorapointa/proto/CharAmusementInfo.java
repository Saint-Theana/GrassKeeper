package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CharAmusementInfo {
    @Tag(tag=10) public Boolean isLastLevel = null;
    @Tag(tag=8) public Integer maxScore = null;
    @Tag(tag=7) public Boolean isSuccess = null;
    @Tag(tag=5) public Boolean isFinish = null;
    @Tag(tag=12) public Integer curScore = null;
}
