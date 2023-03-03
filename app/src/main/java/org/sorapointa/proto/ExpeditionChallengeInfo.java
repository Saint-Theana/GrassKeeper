package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExpeditionChallengeInfo {
    @Tag(tag=5) public Boolean isFinished = null;
    @Tag(tag=11) public Integer id = null;
    @Tag(tag=9) public Integer openTime = null;
}
