package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriMasterInfo {
    @Tag(tag=6) public Boolean isCgViewed = null;
    @Tag(tag=12) public Integer difficulty = null;
    @Tag(tag=13) public Integer levelId = null;
}
