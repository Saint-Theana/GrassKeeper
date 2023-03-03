package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BalloonPlayerInfo {
    @Tag(tag=15) public Integer uid = null;
    @Tag(tag=2) public Integer curScore = null;
    @Tag(tag=14) public Integer comboDisableTime = null;
    @Tag(tag=11) public Integer combo = null;
}
