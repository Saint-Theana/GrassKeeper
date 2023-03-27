package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeResource {
    @Tag(tag=15) public Integer storeLimit = null;
    @Tag(tag=10) public Integer storeValue = null;
    @Tag(tag=1) public Integer nextRefreshTime = null;
}
