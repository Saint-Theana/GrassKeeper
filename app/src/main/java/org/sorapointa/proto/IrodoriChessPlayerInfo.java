package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriChessPlayerInfo {
    @Tag(tag=4) public Integer uid = null;
    @Tag(tag=9) public Integer buildingPoints = null;
    @Tag(tag=3) public Integer settleScore = null;
}
