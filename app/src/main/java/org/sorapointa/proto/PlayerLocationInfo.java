package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class PlayerLocationInfo {
    @Tag(tag=15) public Integer uid = null;
    @Tag(tag=3) public Vector pos = null;
    @Tag(tag=13) public Vector rot = null;
}
