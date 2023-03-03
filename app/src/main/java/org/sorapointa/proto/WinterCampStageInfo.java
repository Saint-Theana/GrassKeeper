package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class WinterCampStageInfo {
    @Tag(tag=12) public Integer curProgress = null;
    @Tag(tag=6) public Integer id = null;
    @Tag(tag=8) public Integer openTime = null;
    @Tag(tag=10) public Boolean isFinished = null;
    @Tag(tag=9) public Integer totalProgress = null;
    @Tag(tag=5) public Vector pos = null;
}
