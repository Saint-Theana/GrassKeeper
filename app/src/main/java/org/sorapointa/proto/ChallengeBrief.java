package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChallengeBrief {
    @Tag(tag=9) public Integer curProgress = null;
    @Tag(tag=10) public Integer challengeIndex = null;
    @Tag(tag=4) public Boolean isSuccess = null;
    @Tag(tag=8) public Integer challengeId = null;
}
