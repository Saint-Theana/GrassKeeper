package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SyncPing {
    @Tag(tag=12) public Long clientGameTime = null;
    @Tag(tag=7) public Long serverGameTime = null;
}
