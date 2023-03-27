package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LuminanceStoneChallengeInfo {
    @Tag(tag=7) public Integer killSpecialMonsterCount = null;
    @Tag(tag=15) public Integer score = null;
    @Tag(tag=4) public Integer killMonsterCount = null;
    @Tag(tag=13) public Integer cleanMudCount = null;
}
