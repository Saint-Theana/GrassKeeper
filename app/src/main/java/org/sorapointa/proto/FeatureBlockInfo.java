package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FeatureBlockInfo {
    @Tag(tag=1) public Integer featureType = null;
    @Tag(tag=2) public Integer endTime = null;
}
