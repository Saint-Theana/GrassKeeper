package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeResource {
    @Tag(tag=15,isFixed=true) public Integer nextRefreshTime = null;
    @Tag(tag=3) public Integer storeLimit = null;
    @Tag(tag=12) public Integer storeValue = null;
}
