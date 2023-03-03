package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGToken.*;
import org.sorapointa.proto.GCGToken;

public class GCGCard {
    @Tag(tag=15) public Integer guid = null;
    @Tag(tag=2) public List<GCGToken> tokenList = new ArrayList<>();
    @Tag(tag=14) public Boolean isShow = null;
    @Tag(tag=7) public Integer controllerId = null;
    @Tag(tag=6) public Integer id = null;
    @Tag(tag=3) public List<Integer> tagList = new ArrayList<>();
    @Tag(tag=5) public Integer faceType = null;
}
