package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ResVersionConfig {
    @Tag(tag=1) public Integer version = null;
    @Tag(tag=2) public Boolean relogin = null;
    @Tag(tag=3) public String md5 = null;
    @Tag(tag=4) public String releaseTotalSize = null;
    @Tag(tag=5) public String versionSuffix = null;
    @Tag(tag=6) public String branch = null;
    @Tag(tag=7) public String nextScriptVersion = null;
}
