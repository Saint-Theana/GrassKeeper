package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BalloonPlayerInfo {
    @Tag(tag=8) public Integer comboDisableTime = null;
    @Tag(tag=13) public Integer curScore = null;
    @Tag(tag=10) public Integer uid = null;
    @Tag(tag=6) public Integer combo = null;
}
