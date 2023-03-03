package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FishingScore {
    @Tag(tag=2) public Integer fishingScore = null;
    @Tag(tag=4) public Boolean isNewRecord = null;
}
