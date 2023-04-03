package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class WinterCampRaceStageInfo {
    @Tag(tag=10) public Vector pos = null;
    @Tag(tag=14) public Integer maxScore = null;
    @Tag(tag=11) public Integer openTime = null;
    @Tag(tag=15) public Integer id = null;
}
