package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class WinterCampStageInfo {
    @Tag(tag=15) public Integer totalProgress = null;
    @Tag(tag=2) public Integer curProgress = null;
    @Tag(tag=13) public Integer id = null;
    @Tag(tag=12) public Integer openTime = null;
    @Tag(tag=6) public Vector pos = null;
    @Tag(tag=9) public Boolean isFinished = null;
}
