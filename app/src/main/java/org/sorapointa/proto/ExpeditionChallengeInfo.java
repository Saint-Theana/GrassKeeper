package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExpeditionChallengeInfo {
    @Tag(tag=11) public Integer openTime = null;
    @Tag(tag=13) public Integer id = null;
    @Tag(tag=15) public Boolean isFinished = null;
}
