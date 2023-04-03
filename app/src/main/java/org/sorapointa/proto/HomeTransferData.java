package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HomeTransferData {
    @Tag(tag=15) public Vector spawnPos = null;
    @Tag(tag=8) public Integer guid = null;
}
