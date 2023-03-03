package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BargainSnapshot.*;
import org.sorapointa.proto.BargainSnapshot;

public class BargainStartNotify {
    @Tag(tag=4) public Integer bargainId = null;
    @Tag(tag=2) public BargainSnapshot snapshot = null;
}
