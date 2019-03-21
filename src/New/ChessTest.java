package New;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class ChessTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create ( JavaArchive.class )
                .addClass ( Chess.class )
                .addAsManifestResource ( EmptyAsset.INSTANCE, "beans.xml" );
    }

    public static void main(String[] args) {
        Position ps = new Position ( 0,0 );
        Horse horse = new Horse ( ps );

        Chess chess = new Chess ( horse );

        System.out.println (horse.getCurrentPosition ());


    }
}
